

    public class Circle extends shape   {
        private double radius =1.0;

        public Circle(){
        }

        public Circle(double radius){
            this.radius = radius;
        }

        public Circle(String color , boolean filled ,double radius){
            super(color, filled);
            this.radius =radius;
        }

        public double getRadius(){
            return this.radius;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI*this.radius*this.radius;
        }

        public double getPerimeter(){
            return 2*Math.PI*this.radius;
        }

        @Override

        public String toString(){
            return "A Circle with radius = "
                    +this.radius
                    +","
                    +"Which is a subclass of "
                    +super.toString();
        }
    }


