package christmasTree;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ChristmasTree {
    private int level;
    private String direction;
    private String stringToDrawTheTree;
    private String temporaryStringToConstruction;
    private String symbolForTree;

    public ChristmasTree(int level, String direction) {
        this.level = level;
        this.direction = direction;
        if (direction != "up" && direction != "down" && direction != "left" && direction != "right") {
            System.out.println("Wrong direction given");
            System.exit(1);
        }
        this.symbolForTree = setSymbolForVerticalTree();
    }

    public String setSymbolForVerticalTree() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please get the symbol you want to use for create a tree: ");
        return input.next();
    }

    public void drawTree() {
        switch (direction) {
            case "up":
                for (int i = 0; i < level; i++) {
                    stringToDrawTheTree = StringUtils.repeat(symbolForTree, ((i * 2) + 1));
                    temporaryStringToConstruction = StringUtils.repeat(" ", level - i - 1);
                    System.out.println(temporaryStringToConstruction + stringToDrawTheTree);
                }
                break;
            case "down":
                for (int i = (level - 1); i > -1; i--) {
                    stringToDrawTheTree = StringUtils.repeat(symbolForTree, ((i * 2) + 1));
                    temporaryStringToConstruction = StringUtils.repeat(" ", level - i - 1);
                    System.out.println(temporaryStringToConstruction + stringToDrawTheTree);
                }
                break;
            case "left":
                for (int i = 0; i < level; i++) {
                    stringToDrawTheTree = StringUtils.repeat("x", (i + 1));
                    temporaryStringToConstruction = StringUtils.repeat(" ", level - i - 1);
                    System.out.println(temporaryStringToConstruction + stringToDrawTheTree);
                }
                for (int i = (level - 2); i > -1; i--) {
                    stringToDrawTheTree = StringUtils.repeat("x", (i + 1));
                    temporaryStringToConstruction = StringUtils.repeat(" ", level - i - 1);
                    System.out.println(temporaryStringToConstruction + stringToDrawTheTree);
                }
                break;
            case "right":
                for (int i = 0; i < level; i++) {
                    stringToDrawTheTree = StringUtils.repeat("x", (i + 1));
                    System.out.println(stringToDrawTheTree);
                }
                for (int i = (level - 2); i > -1; i--) {
                    stringToDrawTheTree = StringUtils.repeat("x", (i + 1));
                    System.out.println(stringToDrawTheTree);
                }
                break;
        }
    }
}

