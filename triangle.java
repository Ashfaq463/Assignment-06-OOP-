
class triangle extends Shape {
	double area;
	
	public void compute_area()
	{
		area = 0.5 * num1 * num2;
	}
	public void display2()
	{
		System.out.println("THe area of triangle is : " +area);
	}

}
