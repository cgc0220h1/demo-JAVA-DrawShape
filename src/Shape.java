import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        int width;
        int height;
        int length;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the isosceles right triangle");
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
                    for (int indexOuter = 0; indexOuter < height; indexOuter++) {
                        for (int indexInner = 0; indexInner < width; indexInner++) {
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
                    for (int indexOuter = 0; indexOuter < length; indexOuter++) {
                        for (int indexInner = 0; indexInner < length; indexInner++) {
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
                            for (int indexOuter = length; indexOuter > 0; indexOuter--) {
                                for (int indexInner = 1; indexInner <= indexOuter; indexInner++) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int indexOuter = length; indexOuter > 0; indexOuter--) {
                                for (int indexWhite = 0; indexWhite < Math.abs(indexOuter - length); indexWhite++) {
                                    System.out.print("\t");
                                }
                                for (int indexInner = 1; indexInner <= indexOuter; indexInner++) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int indexOuter = 1; indexOuter <= length; indexOuter++) {
                                for (int indexInner = 1; indexInner <= indexOuter; indexInner++) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int indexOuter = 1; indexOuter <= length; indexOuter++) {
                                for (int indexWhite = length; indexWhite > indexOuter; indexWhite--) {
                                    System.out.print("\t");
                                }
                                for (int indexInner = 1; indexInner <= indexOuter; indexInner++) {
                                    System.out.print("* \t");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            break;
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
        }
    }
}
