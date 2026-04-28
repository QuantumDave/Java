class Box {
double width;
double height;
double depth;
//constructor used when alldimensions// specified
Box(double w, double h,double d){
    width = w;
    height = h;
    depth = d;
}
// constructor used whennodimensions// specified
Box() {
width = -1; // use -1 toindicate
height = -1; // an uninitialized
depth = -1; // box
}
// constructor used when cubeiscreated
Box(double len) {
width = height = depth =len;}
// compute and return volume
double volume() {
return width * height * depth;
    }
}