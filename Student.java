class Student 
{
	String name;
	String stu_id;
	int score;
	public Student() 
	{
		this(" ", " ", 0);
	}
	public Student(String initName, String initId, int initScore) 
	{
		name = initName;
		stu_id = initId;
		score = initScore;
	}
}
