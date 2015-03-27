package com.lakshman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lakshman.dao.UserDao;
import com.lakshman.domain.Calendar;
import com.lakshman.domain.ForecastUserDetails;
import com.lakshman.domain.GroupsAndProjects;
import com.lakshman.domain.Members;
import com.lakshman.domain.Projects;
import com.lakshman.domain.UpdateForecast;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;
    
    @Override
    public List<Members> getMembersList()
    {
    	return userDao.getMemberList();
    }

    @Override
    public void addMember(Members user) {
        userDao.saveUser(user);

    }

    @Override
	public void updateMember(Members member) {
        userDao.updateUser(member);

	}
    
    @Override
	public void deleteUser(int memberId) {
        userDao.deleteUser(memberId);

	}

	@Override
	public Calendar getAllQuatarData(String year) {
		return userDao.getAllQuatarData(year);
	}

	@Override
	public void saveCalendar(Calendar calendar) {
        userDao.saveCalendar(calendar);
	}

	@Override
	public ForecastUserDetails getMemberForecastData(String year,int psaId) {
		return userDao.getMemberForecastData(year,psaId);
	}

	@Override
	public void updateForecastCalendarforUser(UpdateForecast updateForecast) {
		userDao.updateForecastCalendarforUser(updateForecast);
	}

	@Override
	public boolean validateMemberLoginDetails(String psaID, String pwd) {
		return userDao.validateMemberLoginDetails(psaID,pwd);

	}

	@Override
	public void addProject(Projects projects) {
        userDao.addProject(projects);

	}

	@Override
	public List<Projects> getProjectsList() {
		return userDao.getProjectsList();
	}

	@Override
	public void updateProject(Projects project) {
		userDao.updateProject(project);
	}

	@Override
	public void deleteProject(int projectId) {
		userDao.deleteProject(projectId);

		
	}

}