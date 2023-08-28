package ClassesObjects;

class Box
{
     float width;
     float height;
     float depth;

         Box() 
    {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }
    Box(float width, float height, float depth) 
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(Box otherBox)
    {
        this.width = otherBox.width;
        this.height = otherBox.height;
        this.depth = otherBox.depth;
    }
    // Getters and setters
     float getWidth()
    {
        return width;
    }
     void setWidth(float width)
    {
        this.width = width;
    }
     float getHeight() 
    {
        return height;
    }

     void setHeight(float height)
    {
        this.height = height;
    }
     float getDepth() 
    {
        return depth;
    }
     void setDepth(float depth) 
    {
        this.depth = depth;
    }

    // Volume calculation
     float getVolume() {
        return width * height * depth;
    }
}
 class BoxWeight extends Box {
     float weight;
     BoxWeight() {
        super();
        this.weight = 0;
    }

     BoxWeight(float width, float height, float depth, float weight) {
        super(width, height, depth);
        this.weight = weight;
    }

     BoxWeight(BoxWeight otherBoxWeight) {
        super(otherBoxWeight);
        this.weight = otherBoxWeight.weight;
    }

    // Getters and setters
     float getWeight() {
        return weight;
    }

     void setWeight(float weight) {
        this.weight = weight;
    }

    
     void displayWeight() {
        System.out.println("Weight of the box is: " + weight);
    }
}
 class BoxWeightDemo {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        BoxWeight box2 = new BoxWeight(5, 10, 15, 25);
        Box box3 = new Box(box1);

        System.out.println("Volume of box1 is: " + box1.getVolume());
        System.out.println("Volume of box2 is: " + box2.getVolume());
        System.out.println("Volume of box3 is: " + box3.getVolume());
        box2.displayWeight();

        box1.setWidth(15);
        box1.setHeight(25);
        box1.setDepth(35);

        System.out.println("New volume of box1 is: " + box1.getVolume());
    }
}
