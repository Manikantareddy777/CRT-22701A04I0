package REALTIMEOVERRIDE;

class Instagram3 extends Instagram2
{
	void upload()
	{
		super.upload();
		System.out.println("videos are uploaded");
	}
	void Dmessage()
	{
		super.Dmessage();
		System.out.println("images are supported");
	}
	void story()
	{
		System.out.println("stories are supported");
	}
	public static void main(String[] args)
	{
		Instagram3 i=new Instagram3();
		i.upload();
		System.out.println("-------------------------------");
		i.Dmessage();
		System.out.println("--------------------------------");
		i.story();
		
	}

}
