package com.HibernateTutorial;

import com.HibernateTutorial.dao.ProjetDao;
import com.HibernateTutorial.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class HibernateTutorialApplication  {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ProjetDao projectDao;

	public static void main(String[] args) {
		SpringApplication.run(HibernateTutorialApplication.class, args);

		//new HibernateTutorialApplication().execute();

	}


/*	public void execute()
	{
		System.out.println("==>"+projectDao);
		List l1 = projectDao.getProject();
		Iterator<Project> listOfPro = l1.iterator();

		while(listOfPro.hasNext())
		{
			System.out.println("==>"+listOfPro.next());
		}

	}*/

	//@Override
	/*public void run(String... args) throws Exception {

		String sql = "Insert into project (pname,pnumber,plocation,dnum) values ('Babu','358','Pune',6)";
		int result = jdbcTemplate.update(sql);
		if(result > 0)
		{
			System.out.println("A new Record is inserted");
		}

	}*/

}
