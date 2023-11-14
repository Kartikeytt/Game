import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println(
                "You find yourself standing at the edge of a dark forest. The path ahead is shrouded in mist.");

        System.out.println("What do you do?");
        System.out.println("1. Enter the forest");
        System.out.println("2. Go back the way you came");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println(
                    "You cautiously enter the forest. The trees are tall and gnarled, and the air is thick with fog.");
            System.out.println(
                    "You come to a fork in the path. To the left, you hear the sound of running water. To the right, you see a faint glow in the distance.");

            System.out.println("What do you do?");
            System.out.println("1. Follow the sound of running water");
            System.out.println("2. Follow the faint glow");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println(
                        "You follow the sound of running water and come to a stream. You kneel down and take a drink of the cool, refreshing water.");
                System.out.println(
                        "Suddenly, you hear a growl behind you. You turn around to see a wolf standing there, its fangs bared.");

                System.out.println("What do you do?");
                System.out.println("1. Fight the wolf");
                System.out.println("2. Run away");

                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println(
                            "You draw your sword and attack the wolf. The wolf lunges at you, but you manage to dodge its attack and strike it down.");
                    System.out.println("You defeat the wolf and continue on your journey.");
                } else if (choice == 2) {
                    System.out.println(
                            "You turn and run away from the wolf. The wolf chases after you, but you manage to outrun it and escape.");
                    System.out.println("You return to the fork in the path.");
                }
            } else if (choice == 2) {
                System.out.println(
                        "You follow the faint glow and come to a clearing. In the middle of the clearing, there is a small cottage. You knock on the door.");

                System.out.println(
                        "The door opens, and an old woman standing there. She smiles at you and invites you in.");
                System.out.println(
                        "You accept her offer and go inside the cottage. The old woman gives you a warm meal and a place to sleep.");
                System.out.println(
                        "The next morning, you thank the old woman for her hospitality and continue on your journey.");
            }
        } else if (choice == 2) {
            System.out.println(
                    "You turn around and start walking back the way you came. You soon find yourself back at the edge of the forest.");
            System.out.println("The sun is setting, and you decide to make camp for the night.");
            System.out.println(
                    "You build a campfire and cook a meal over the fire. As you eat, you think about the journey that lies ahead.");
            System.out.println("The next morning, you pack up your camp and continue on your way.");
        }
    }
}
