import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int width;
        int height;
        int length;

        do {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the isosceles right triangle");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle!");
                    System.out.print("Enter width: ");
                    width = scanner.nextInt();
                    System.out.print("Enter height: ");
                    height = scanner.nextInt();
                    System.out.println("Here, let me draw it for you: \n");

                    for (int row = 0; row < height; row++) {
                        for (int asterisk = 0; asterisk < width; asterisk++) {
                            System.out.print("* \t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square!");
                    System.out.print("Enter length of square's side: ");
                    length = scanner.nextInt();
                    System.out.println("Here, let me draw it for you: \n");

                    for (int row = 0; row < length; row++) {
                        for (int asterisk = 0; asterisk < length; asterisk++) {
                            System.out.print("* \t");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("Draw the isosceles right triangle!");
                    System.out.println("Choose right angle position:");
                    System.out.println("1. upper-left");
                    System.out.println("2. upper-right");
                    System.out.println("3. bottom-left");
                    System.out.println("4. bottom-right");
                    System.out.println("0. Back");

                    boolean isValid = false;
                    int choicePosition;

                    do {
                        System.out.print("Enter your choice: ");
                        choicePosition = scanner.nextInt();
                        if (choicePosition == 0 ||
                                choicePosition == 1 ||
                                choicePosition == 2 ||
                                choicePosition == 3 ||
                                choicePosition == 4) {
                            isValid = true;
                        }

                        if (!isValid) {
                            System.out.println("Invalid choice!. Please choose again, or choose 0 to back");
                        }
                    } while (!isValid);

                    if (choicePosition == 0) {
                        break;
                    }

                    System.out.println();
                    System.out.print("Enter length of triangle's side: ");
                    length = scanner.nextInt();
                    System.out.println("Here, let me draw it for you: \n");

                    switch (choicePosition) {
                        case 1:
                            for (int row = 1; row <= length; row++) {
                                for (int asterisk = length; asterisk >= row; asterisk--) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int row = 1; row <= length; row++) {
                                for (int whiteSpace = 1; whiteSpace < row; whiteSpace++) {
                                    System.out.print("\t");
                                }
                                for (int asterisk = length; asterisk >= row; asterisk--) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int row = 1; row <= length; row++) {
                                for (int asterisk = 1; asterisk <= row; asterisk++) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int row = 1; row <= length; row++) {
                                for (int whiteSpace = length; whiteSpace > row; whiteSpace--) {
                                    System.out.print("\t");
                                }
                                for (int asterisk = 1; asterisk <= row; asterisk++) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Draw the isosceles triangle!");
                    System.out.print("Enter length of triangle's side: ");
                    length = scanner.nextInt();
                    System.out.println("Here, let me draw it for you: \n");

                    for (int row = 1; row <= length; row++) {
                        for (int whiteSpace = length; whiteSpace > row; whiteSpace--) {
                            System.out.print("\t");
                        }
                        for (int asterisk = 1; asterisk <= row; asterisk++) {
                            System.out.print("* \t \t");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exit Program!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again or choose 0 to Exit!");
            }
            System.out.println();
        } while (choice != 0);
    }
}
