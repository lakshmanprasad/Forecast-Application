package com.lakshman.service;

import java.util.List;

import com.lakshman.domain.Calendar;
import com.lakshman.domain.ForecastUserDetails;
import com.lakshman.domain.GroupsAndProjects;
import com.lakshman.domain.Members;
import com.lakshman.domain.Projects;
import com.lakshman.domain.UpdateForecast;
public interface UserService {
	public List<Members> getMembersList();
    public void addMember(Members user);
    public void updateMember(Members member);
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