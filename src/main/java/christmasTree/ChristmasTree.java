package christmasTree;

import org.apache.commons.lang3.StringUtils;

public class ChristmasTree {
    private int level;
    private String direction;
    private String stringToDrawTheTree;
    private String temporaryStringToConstruction;

    public ChristmasTree(int level, String direction) {
        this.level = level;
        this.direction = direction;
        if (direction != "up" && direction != "down" && direction != "left" && direction != "right") {
            System.out.println("Wrong direction given");
            System.exit(1);
        }
    }

    public void drawTree() {
        switch (direction) {
            case "up":
                for (int i = 0; i < level; i++) {
                    stringToDrawTheTree = StringUtils.repeat("*", ((i * 2) + 1));
                    temporaryStringToConstruction = StringUtils.repeat(" ", level - i - 1);
                    System.out.println(temporaryStringToConstruction + stringToDrawTheTree);
                }
                break;
            case "down":
                for (int i = (level - 1); i > -1; i--) {
                    stringToDrawTheTree = StringUtils.repeat("*", ((i * 2) + 1));
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

