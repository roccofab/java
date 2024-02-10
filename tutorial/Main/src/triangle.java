public class triangle extends OverloadClass{

    private static double width;
    private static double height;
    public triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return (width * height)/2;
    }
    public static class rightTriangle extends triangle {
        private double hypotenuse;

        public rightTriangle(double width, double height, double hypotenuse) {
            super(width, height);
            this.hypotenuse = hypotenuse;
        }
        @Override
        public double calculateArea() {
            return(width * height)/2;
        }
    }

    public static class equilaterTriangle extends triangle {
        private double sideLength;
        public equilaterTriangle(double sideLength) {
            super(sideLength, Math.sqrt(3) * sideLength/2);
            this.sideLength = sideLength;
        }
        @Override
        public double calculateArea() {
            return Math.sqrt(3) * sideLength * sideLength/4;
        }
    }

    public static class isoscelesTriangle extends triangle {
        private double sideLength;

        public isoscelesTriangle(double width, double height) {
            super(width, height); // Call super() in the first line
            this.sideLength = calculateSideLength(width, height); // Calculate and assign sideLength later
        }

        public isoscelesTriangle(double width, double height, double sideLength) {
            super(width, height); // Call super() in the first line
            this.sideLength = sideLength;
        }

        private double calculateSideLength(double width, double height) {
            double sideLength = Math.sqrt((width * width + 4 * height * height) / 4);
            return sideLength;
        }

        @Override
        public double calculateArea() {
           return (width * height)/2;
        }
    }

}