package com.lakshman.dao;

import java.util.List;

import com.lakshman.domain.Calendar;
import com.lakshman.domain.ForecastUserDetails;
import com.lakshman.domain.Members;
import com.lakshman.domain.Projects;
import com.lakshman.domain.UpdateForecast;

public interface UserDao {
	public List<Members> getMemberList();

	public void saveUser(Members member);

	public void updateUser(Members member);

	public void deleteUser(int memberId);
	
	public Calendar getAllQuatarData(String year);
	
	public void saveCalendar(Calendar calendar);
	
	public ForecastUserDetails getMemberForecastData(String year,int psaId);
	
    public void updateForecastCalendarforUser(UpdateForecast updateForecast);
    
    public boolean validateMemberLoginDetails(String psaID, String pwd);
    
	public void addProject(Projects projects);
	
	public List<Projects> getProjectsList();
	
    public void updateProject(Projects project);

    public void deleteProject(int projectId);




}