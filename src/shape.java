public class shape {
        String color ="green";
        boolean filled = true;

        public shape(){
        }

        public shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }

        public String getColor(){
            return this.color;
        }

        public boolean getfilled(){
            return this.filled;
        }

        public void setColor(String color){
            this.color =color;
        }

        public void setFilled(boolean filled){
            this.filled = filled;
        }

        @Override

        public String toString(){
            return "A shape with color of"
                    +" "
                    + getColor()
                    +" "
                    +"anh"
                    +" "
                    +( getfilled() ? "filled" : "not filled");
        }
        public static void main(String[] args) {
            shape shape = new shape();
            System.out.println(shape);

            shape = new shape("red", false);
            System.out.println(shape);
        }

    }

