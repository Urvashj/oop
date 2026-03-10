class VolumeCalculator {

    // Method for Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method for Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method for Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        VolumeCalculator obj = new VolumeCalculator();

        double cubeVolume = obj.calculateVolume(5);
        double rectangularCubeVolume = obj.calculateVolume(4, 3, 2);
        double sphereVolume = obj.calculateVolume(3f);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}