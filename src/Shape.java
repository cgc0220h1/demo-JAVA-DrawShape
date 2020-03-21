import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiceMenu;
        int width;
        int height;
        int length;

        do {
            boolean isValidNum = false;
            boolean isValidChoice = false;
            int choicePosition;

            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the isosceles right triangle");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("5. Draw the number triangle");
            System.out.println("6. Draw the number triangle type 2");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choiceMenu = scanner.nextInt();
            System.out.println();

            switch (choiceMenu) {
                case 1:
                    System.out.println("Draw the rectangle!");

                    do {
                        System.out.print("Enter width: ");
                        width = scanner.nextInt();
                        System.out.print("Enter height: ");
                        height = scanner.nextInt();
                        if (width > 2 && height > 2) {
                            isValidNum = true;
                        }
                        if (!isValidNum) {
                            System.out.println("I can't draw that!. Please enter again. Minimum is 2!");
                        }
                    } while (!isValidNum);

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

                    do {
                        System.out.print("Enter length of square's side: ");
                        length = scanner.nextInt();
                        if (length > 2) {
                            isValidNum = true;
                        }
                        if (!isValidNum) {
                            System.out.println("I can't draw that!. Please enter again. Minimum is 2!");
                        }
                    } while (!isValidNum);

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

                    do {
                        System.out.print("Enter your choice: ");
                        choicePosition = scanner.nextInt();
                        if (choicePosition == 0 ||
                                choicePosition == 1 ||
                                choicePosition == 2 ||
                                choicePosition == 3 ||
                                choicePosition == 4) {
                            isValidChoice = true;
                        }
                        if (!isValidChoice) {
                            System.out.println("Invalid choice!. Please choose again, or choose 0 to back");
                        }
                    } while (!isValidChoice);

                    if (choicePosition == 0) {
                        break;
                    }

                    System.out.println();

                    do {
                        System.out.print("Enter length of triangle's side: ");
                        length = scanner.nextInt();
                        if (length > 2) {
                            isValidNum = true;
                        }
                        if (!isValidNum) {
                            System.out.println("I can't draw that!. Please enter again. Minimum is 2!");
                        }
                    } while (!isValidNum);

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

                    do {
                        System.out.print("Enter length of triangle's side: ");
                        length = scanner.nextInt();
                        if (length > 2) {
                            isValidNum = true;
                        }
                        if (!isValidNum) {
                            System.out.println("I can't draw that!. Please enter again. Minimum is 2!");
                        }
                    } while (!isValidNum);

                    System.out.println("Here, let me draw it for you: \n");

                    for (int row = 1; row <= length; row++) {
                        for (int whiteSpace = length; whiteSpace > row; whiteSpace--) {
                            System.out.print(" ");
                        }
                        for (int asterisk = 1; asterisk <= row; asterisk++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Draw the number triangle!");

                    do {
                        System.out.print("Enter length of triangle's side: ");
                        length = scanner.nextInt();
                        if (length > 2 && length <10) {
                            isValidNum = true;
                        }
                        if (!isValidNum) {
                            System.out.println("I can't draw that!. Please enter again. Minimum is 2!");
                        }
                    } while (!isValidNum);

                    System.out.println("Here, let me draw it for you: \n");

                    for (int row = 1, display = 1; row <= length + 4; row += 2, display++) {
                        for (int whiteSpace = length; whiteSpace > display; whiteSpace--) {
                            System.out.print(" ");
                        }
                        for (int number = 1; number <= row; number++) {
                            System.out.printf("%d", display);
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Draw the number triangle type 2!");

                    do {
                        System.out.print("Enter length of triangle's side: ");
                        length = scanner.nextInt();
                        if (length > 2 && length <10) {
                            isValidNum = true;
                        }
                        if (!isValidNum) {
                            System.out.println("I can't draw that!. Please enter again. Minimum is 2!");
                        }
                    } while (!isValidNum);

                    System.out.println("Here, let me draw it for you: \n");

                    for (int row = 1; row <= length; row++) {
                        for (int whiteSpace = length; whiteSpace > row; whiteSpace--) {
                            System.out.print(" ");
                        }
                        for (int number = 1, displayIn = row; number <= row; number++, displayIn--) {
                            System.out.printf("%d", displayIn);
                        }
                        for (int number = 1, displayOut = 2; number <= row-1; number++, displayOut++) {
                            System.out.printf("%d", displayOut);
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
        } while (choiceMenu != 0);
    }
}
