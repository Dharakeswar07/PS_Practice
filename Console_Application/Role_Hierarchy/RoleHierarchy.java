package Console_Application.Role_Hierarchy;
import java.util.*;

class Role {
    String name;
    Role parent;
    List<Role> subRoles;

    Role(String name) {
        this.name = name;
        this.subRoles = new ArrayList<>();
    }

    void addSubRole(Role role) {
        role.parent = this;
        this.subRoles.add(role);
    }
}

class User {
    String name;
    Role role;

    User(String name, Role role) {
        this.name = name;
        this.role = role;
    }
}

class Company {
    Role rootRole;
    Map<String, Role> roleMap;
    Map<String, User> userMap;

    Company(String rootRoleName) {
        this.rootRole = new Role(rootRoleName);
        this.roleMap = new HashMap<>();
        this.roleMap.put(rootRoleName, rootRole);
        this.userMap = new HashMap<>();
    }

    void addSubRole(String subRoleName, String reportingToRoleName) {
        Role reportingToRole = roleMap.get(reportingToRoleName);
        if (reportingToRole != null) {
            Role subRole = new Role(subRoleName);
            reportingToRole.addSubRole(subRole);
            roleMap.put(subRoleName, subRole);
        }
    }

    void deleteRole(String roleName, String transferRoleName) {
        Role roleToDelete = roleMap.get(roleName);
        Role transferRole = roleMap.get(transferRoleName);

        if (roleToDelete != null && transferRole != null) {
            Role parentRole = roleToDelete.parent;
            if (parentRole != null) {
                for (Role subRole : roleToDelete.subRoles) {
                    parentRole.addSubRole(subRole);
                }
                parentRole.subRoles.remove(roleToDelete);
                roleMap.remove(roleName);
            }
        }
    }

    void addUser(String userName, String roleName) {
        Role role = roleMap.get(roleName);
        if (role != null) {
            User user = new User(userName, role);
            userMap.put(userName, user);
        }
    }

    void deleteUser(String userName) {
        userMap.remove(userName);
    }

    void displayRoles() {
        displayRolesRecursively(rootRole, 0);
    }

    private void displayRolesRecursively(Role role, int level) {
        System.out.println("  ".repeat(level) + role.name);
        for (Role subRole : role.subRoles) {
            displayRolesRecursively(subRole, level + 1);
        }
    }

    void displayUsers() {
        for (User user : userMap.values()) {
            System.out.println(user.name + " - " + user.role.name);
        }
    }

    void displayUsersAndSubUsers() {
        for (User user : userMap.values()) {
            List<String> subUsers = getSubUsers(user);
            System.out.println(user.name + " - " + String.join(", ", subUsers));
        }
    }

    private List<String> getSubUsers(User user) {
        List<String> subUsers = new ArrayList<>();
        for (User subUser : userMap.values()) {
            if (isSubUser(user.role, subUser.role)) {
                subUsers.add(subUser.name);
            }
        }
        return subUsers;
    }

    private boolean isSubUser(Role parentRole, Role subRole) {
        while (subRole != null) {
            if (subRole == parentRole) {
                return true;
            }
            subRole = subRole.parent;
        }
        return false;
    }

    int numberOfUsersFromTop(String userName) {
        User user = userMap.get(userName);
        if (user == null) return -1;

        int count = 0;
        Role role = user.role;
        while (role != null) {
            count++;
            role = role.parent;
        }
        return count;
    }

    int heightOfRoleHierarchy() {
        return heightOfRoleHierarchy(rootRole);
    }

    private int heightOfRoleHierarchy(Role role) {
        if (role.subRoles.isEmpty()) return 1;
        int maxHeight = 0;
        for (Role subRole : role.subRoles) {
            maxHeight = Math.max(maxHeight, heightOfRoleHierarchy(subRole));
        }
        return maxHeight + 1;
    }

    String topMostCommonBoss(String user1, String user2) {
        User u1 = userMap.get(user1);
        User u2 = userMap.get(user2);
        if (u1 == null || u2 == null) return null;

        Set<Role> ancestors = new HashSet<>();
        Role role1 = u1.role;
        while (role1 != null) {
            ancestors.add(role1);
            role1 = role1.parent;
        }

        Role role2 = u2.role;
        while (role2 != null) {
            if (ancestors.contains(role2)) {
                return role2.name;
            }
            role2 = role2.parent;
        }
        return null;
    }
}

public class RoleHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter root role name: ");
        String rootRoleName = scanner.nextLine();
        Company company = new Company(rootRoleName);
        System.out.println(rootRoleName);

        while (true) {
            System.out.println("Operations:");
            System.out.println("1. Add Sub Role.");
            System.out.println("2. Display Roles.");
            System.out.println("3. Delete Role.");
            System.out.println("4. Add User.");
            System.out.println("5. Display Users.");
            System.out.println("6. Display Users and Sub Users.");
            System.out.println("7. Delete User.");
            System.out.println("8. Number of users from top.");
            System.out.println("9. Height of role hierarchy.");
            System.out.println("10. Common boss of users.");
            System.out.print("Operation to be performed: ");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1 -> {
                    System.out.print("Enter sub role name: ");
                    String subRoleName = scanner.nextLine();
                    System.out.print("Enter reporting to role name: ");
                    String reportingToRoleName = scanner.nextLine();
                    company.addSubRole(subRoleName, reportingToRoleName);
                }
                case 2 -> company.displayRoles();
                case 3 -> {
                    System.out.print("Enter the role to be deleted: ");
                    String roleName = scanner.nextLine();
                    System.out.print("Enter the role to be transferred: ");
                    String transferRoleName = scanner.nextLine();
                    company.deleteRole(roleName, transferRoleName);
                }
                case 4 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter role: ");
                    String roleName = scanner.nextLine();
                    company.addUser(userName, roleName);
                }
                case 5 -> company.displayUsers();
                case 6 -> company.displayUsersAndSubUsers();
                case 7 -> {
                    System.out.print("Enter username to be deleted: ");
                    String userName = scanner.nextLine();
                    company.deleteUser(userName);
                }
                case 8 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    int count = company.numberOfUsersFromTop(userName);
                    System.out.println("Number of users from top: " + count);
                }
                case 9 -> {
                    int height = company.heightOfRoleHierarchy();
                    System.out.println("Height of role hierarchy: " + height);
                }
                case 10 -> {
                    System.out.print("Enter user 1: ");
                    String user1 = scanner.nextLine();
                    System.out.print("Enter user 2: ");
                    String user2 = scanner.nextLine();
                    String boss = company.topMostCommonBoss(user1, user2);
                    System.out.println("Top most common boss: " + boss);
                }
                default -> System.out.println("Invalid operation.");
            }
        }
    }
}
