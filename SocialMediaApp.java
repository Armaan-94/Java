import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

// user profile
class UserProfile {
    String name, location, interests;
    int age;
    Scanner input = new Scanner(System.in);

    // getting data of user
    void getUserData() {
        System.out.println("\n\n\nDETAILS FOR YOUR USERPROFILE\n\n\n");

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        try {
            age = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a valid integer value.");
            getUserData(); // Retry getting user data
            return;
        }

        System.out.print("Enter your location: ");
        location = input.nextLine();

        System.out.print("Enter your interests: ");
        interests = input.nextLine();
    }

    // information display
    void display() {
        System.out.println("\n\nUser Profile:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
        System.out.println("Interests: " + interests);
    }

    // viewing or editing data
    void viewOrEdit() {
        System.out.println("Choose an option (TYPE OPTION NUMBER): 1) View your profile  2) Edit your profile");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("\n\nUser Profile:");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Location: " + location);
                System.out.println("Interests: " + interests);
                break;

            case 2:
                System.out.println("\nEnter your new information:");

                input.nextLine(); // consume the remaining newline character

                System.out.print("Name: ");
                name = input.nextLine();

                System.out.print("Age: ");
                try {
                    age = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age. Please enter a valid integer value.");
                    viewOrEdit(); // Retry viewing or editing data
                    return;
                }

                System.out.print("Location: ");
                location = input.nextLine();

                System.out.print("Interests: ");
                interests = input.nextLine();

                System.out.println("\n\nUser Profile:");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Location: " + location);
                System.out.println("Interests: " + interests);
                break;
        }
    }

    // save user profile to file
    void saveProfileToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(name);
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(age));
            bufferedWriter.newLine();
            bufferedWriter.write(location);
            bufferedWriter.newLine();
            bufferedWriter.write(interests);

            bufferedWriter.close();
            System.out.println("User profile saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving user profile: " + e.getMessage());
        }
    }

    // load user profile from file
    void loadProfileFromFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            name = bufferedReader.readLine();
            age = Integer.parseInt(bufferedReader.readLine());
            location = bufferedReader.readLine();
            interests = bufferedReader.readLine();

            bufferedReader.close();
            System.out.println("User profile loaded from file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("User profile file not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while loading user profile: " + e.getMessage());
        }
    }
}

// friends list class
class FriendList {
    ArrayList<String> friendsList = new ArrayList<>();

    void addFriend() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\nDETAILS FOR YOUR FRIEND LIST\n\n\n");
        System.out.print("Enter friend name to add: ");
        String name = sc.nextLine();
        friendsList.add(name);
        System.out.println("Successfully added " + name);

        while (true) {
            System.out.print("Do you want to add another friend? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                System.out.print("Enter the name of the friend you want to add: ");
                String friendName = sc.nextLine();

                sc.nextLine();
                friendsList.add(friendName);

                System.out.println(friendName + " has been added to your friend network.");
            } else if (choice == 'n' || choice == 'N') {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
            }
        }
    }

    void removeFriend() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to remove a friend? (y/n)");
        char c = sc.next().charAt(0);
        while (true) {
            if (c == 'y' || c == 'Y') {
                System.out.print("Enter friend name to remove: ");
                String name = sc.nextLine();
                sc.nextLine();
                boolean removed = friendsList.remove(name);
                if (removed) {
                    System.out.println("Successfully removed " + name);
                    break;
                } else {
                    System.out.println(name + " not found in friends list");
                    break;
                }
            } else if (c == 'n' || c == 'N') {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                break;
            }
        }
    }

    void display() {
        System.out.println("Friends List:");
        for (String friend : friendsList) {
            System.out.println("- " + friend);
        }
    }

    boolean hasFriend() {
        return !friendsList.isEmpty();
    }

    // save friends list to file
    void saveFriendsListToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String friend : friendsList) {
                bufferedWriter.write(friend);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Friends list saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving friends list: " + e.getMessage());
        }
    }

    // load friends list from file
    void loadFriendsListFromFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String friendName;
            while ((friendName = bufferedReader.readLine()) != null) {
                friendsList.add(friendName);
            }

            bufferedReader.close();
            System.out.println("Friends list loaded from file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Friends list file not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while loading friends list: " + e.getMessage());
        }
    }
}

// post class
class Post {
    String content, caption, location;
    ArrayList<String> tags = new ArrayList<String>();

    void posting() {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to add a post? (y/n)");
        char d = input.next().charAt(0);
        while (true) {
            if (d == 'y' || d == 'Y') {
                // creating a new post
                System.out.println("\n\n\nCREATE A NEW POST\n\n\n");

                System.out.print("Enter the content of the post: ");
                input.nextLine();
                content = input.nextLine();

                System.out.print("Enter a caption: ");
                caption = input.nextLine();

                System.out.print("Enter a location: ");
                location = input.nextLine();

                System.out.print("Do you want to add a tag? (y/n): ");
                char choice = input.next().charAt(0);
                input.nextLine(); // consume the remaining newline character

                while (true) {
                    if (choice == 'y' || choice == 'Y') {
                        System.out.print("Enter a tag: ");
                        String tag = input.nextLine();
                        tags.add(tag);
                        break;
                    } else if (choice == 'n' || choice == 'N') {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                        break;
                    }
                }
            } else if (d == 'n' || d == 'N') {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                break;
            }
            break;
        }
    }

    void display() {
        // displaying post details
        System.out.println("\n\nPost Details:");
        System.out.println("Content: " + content);
        System.out.println("Caption: " + caption);
        System.out.println("Location: " + location);
        System.out.println("Tags: " + tags);
    }

    boolean hasTags() {
        return !tags.isEmpty();
    }

    // save post to file
    void savePostToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(content);
            bufferedWriter.newLine();
            bufferedWriter.write(caption);
            bufferedWriter.newLine();
            bufferedWriter.write(location);
            bufferedWriter.newLine();

            bufferedWriter.write(String.valueOf(tags.size()));
            bufferedWriter.newLine();
            for (String tag : tags) {
                bufferedWriter.write(tag);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Post saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving post: " + e.getMessage());
        }
    }

    // load post from file
    void loadPostFromFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            content = bufferedReader.readLine();
            caption = bufferedReader.readLine();
            location = bufferedReader.readLine();

            int tagsCount = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < tagsCount; i++) {
                String tag = bufferedReader.readLine();
                tags.add(tag);
            }

            bufferedReader.close();
            System.out.println("Post loaded from file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Post file not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while loading post: " + e.getMessage());
        }
    }
}// Comment class
class Comment {
    String commenter;
    String content;
    ArrayList<String> comments = new ArrayList<>();

    void addComment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to add a comment? (y/n): ");
        char choice = input.nextLine().charAt(0);

        while (choice == 'y' || choice == 'Y') {
            System.out.print("Enter your name: ");
            commenter = input.nextLine();

            System.out.print("Enter your comment: ");
            content = input.nextLine();

            comments.add(content);

            System.out.print("Do you want to add another comment? (y/n): ");
            choice = input.nextLine().charAt(0);
        }
    }
    // Display the comments
    void display2() {
        System.out.println("Comments:");
        for (String comment : comments) {
            System.out.println("- " + comment);
        }
    }

    boolean hasComments() {
        return !comments.isEmpty();
    }
}

// Notifications class
class Notifications {
    void showNotification(boolean hasComments) {
        System.out.println("Notifications:");
        if (hasComments) {
            System.out.println("You have new comments!");
        } else {
            System.out.println("No new comments.");
        }
    }

    void showNotification1(boolean hasTags) {
        System.out.println("Notifications:");
        if (hasTags) {
            System.out.println("You have new tag!");
        } else {
            System.out.println("No new tag.");
        }
    }

    void showNotification2(boolean hasFriend) {
        System.out.println("Notifications:");
        if (hasFriend) {
            System.out.println("You have added a new friend!");
        } else {
            System.out.println("No new friend added.");
        }
    }
}


public class SocialMediaApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Social Network!");
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to create a user profile? (y/n)");
        char a = input.next().charAt(0);

        UserProfile user = new UserProfile();
        if (a == 'y' || a == 'Y') {
            user.getUserData();
            user.display();
        }

        System.out.println("Do you want to save/load your user profile to/from a file? (y/n)");
        char b = input.next().charAt(0);
        input.nextLine(); // consume the remaining newline character

        if (b == 'y' || b == 'Y') {
            System.out.println("Enter the file name to save/load user profile: ");
            String fileName = input.nextLine();

            if (a == 'y' || a == 'Y') {
                user.saveProfileToFile(fileName);
            } else {
                user.loadProfileFromFile(fileName);
            }
        }

        FriendList friends = new FriendList();

        System.out.println("Do you want to create a friends list? (y/n)");
        char c = input.next().charAt(0);

        if (c == 'y' || c == 'Y') {
            friends.addFriend();
            friends.display();
        }

        System.out.println("Do you want to save/load your friends list to/from a file? (y/n)");
        char d = input.next().charAt(0);
        input.nextLine(); // consume the remaining newline character

        if (d == 'y' || d == 'Y') {
            System.out.println("Enter the file name to save/load friends list: ");
            String fileName = input.nextLine();

            if (c == 'y' || c == 'Y') {
                friends.saveFriendsListToFile(fileName);
            } else {
                friends.loadFriendsListFromFile(fileName);
            }
        }

        Post post = new Post();

        System.out.println("Do you want to create a post? (y/n)");
        char e = input.next().charAt(0);

        if (e == 'y' || e == 'Y') {
            post.posting();
            post.display();
        }

        System.out.println("Do you want to save/load your post to/from a file? (y/n)");
        char f = input.next().charAt(0);
        input.nextLine(); // consume the remaining newline character

        if (f == 'y' || f == 'Y') {
            System.out.println("Enter the file name to save/load post: ");
            String fileName = input.nextLine();

            if (e == 'y' || e == 'Y') {
                post.savePostToFile(fileName);
            } else {
                post.loadPostFromFile(fileName);
            }
        }
        Comment cc = new Comment();
        cc.addComment();
        cc.display2();

        Notifications notifications = new Notifications();
        notifications.showNotification(cc.hasComments());
        notifications.showNotification1(post.hasTags());
        notifications.showNotification2(friends.hasFriend());
    }
}

