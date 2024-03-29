package testapk;
import java.io.File;

class DeleteAllure
{
	public static boolean deleteDir(File dir) 
	{
		if (dir.isDirectory()) 
		{
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) 
			{
				boolean success = deleteDir (new File(dir, children[i]));

				if (!success) 
				{
					return false;
				}
			}
		}
		System.out.println("The directory is deleted.");

		return dir.delete();
		
	}
}
