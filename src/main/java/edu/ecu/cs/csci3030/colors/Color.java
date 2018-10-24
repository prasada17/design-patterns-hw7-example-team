package edu.ecu.cs.csci3030.colors;

/**
 * Colors available in the system
 *
 * @author Mark Hills
 * @version 1.0
 */
public enum Color {
    RED {
        @Override
        public String toString() {
            return "Red";
        }
    },
    BLUE {
        @Override
        public String toString() {
            return "Blue";
        }
    },
    YELLOW {
        @Override
        public String toString() {
            return "Yellow";
        }
    },
    GREEN {
        @Override
        public String toString() {
            return "Green";
        }
    }
}
