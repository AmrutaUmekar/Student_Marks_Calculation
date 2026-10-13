
class Student{
int id;
String name;
String[] subjectName;
double[] marks;

Student(int id,String name,String[] subjectName,double[] marks){
this.id = id;
this.name = name;
this.subjectName = subjectName;
this.marks = marks;
}
double calculateTotal(){
double total = 0;
for(double mark : marks){
total = total + mark;
}
return total;
}
double calculatePercentage(){
return calculateTotal()/marks.length;
}
void display(){
System.out.println("ID = "+id);
System.out.println("Name = "+name);
for(int i=0;i<marks.length;i++){
System.out.println(subjectName[i] +" : "+marks[i]);
}
System.out.println("Total = "+calculateTotal());
System.out.println("percentage = "+calculatePercentage() +"%");
}
}