enum Operation {
    ADD {
        public int apply(int x, int y) { return x + y; }
    },
    MULTIPLY {
        public int apply(int x, int y) { return x * y; }
    },
    SUBTRACT{
        public int apply(int x, int y){ return x-y;}
    },
    DIVIDE {
        public int apply(int a, int b) {
            if (b == 0) throw new ArithmeticException("Can't divide by zero");
            return a / b;
        }
    };


    public abstract int apply(int x, int y);
}

// enum Operation{
//     ADD, SUBTRACT, MULTIPLY, DIVIDE;

//         public int apply(int a, int b) {
//         return switch (this) {
//             case ADD      -> a + b;
//             case SUBTRACT -> a - b;
//             case MULTIPLY -> a * b;
//             case DIVIDE   -> b != 0 ? a / b : 0;
//         };
//     }
// }

public class InterfaceEnumExample {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(5, 3));
        System.out.println(Operation.MULTIPLY.apply(5, 3)); 
        System.out.println(Operation.SUBTRACT.apply(78, 56));
        // System.out.println(Operation.DIVIDE.apply(5, 0));
        System.out.println(Operation.DIVIDE.apply(40, 8));
    }
}

