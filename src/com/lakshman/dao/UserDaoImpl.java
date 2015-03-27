package com.lakshman.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.lakshman.domain.Calendar;
import com.lakshman.domain.ForecastUserDetails;
import com.lakshman.domain.Groups;
import com.lakshman.domain.GroupsAndProjects;
import com.lakshman.domain.Members;
import com.lakshman.domain.Projects;
import com.lakshman.domain.UpdateForecast;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Members> getMemberList() {
		String getMembersQuery = "FROM Members";
		Query query = sessionFactory.getCurrentSession().createQuery(
				getMembersQuery);
		List<Members> results = query.list();
		return results;
	}

	@Override
	@Transactional
	public void saveUser(Members member) {
		sessionFactory.getCurrentSession().save(member);
	}

	@Override
	@Transactional
	public void updateUser(Members member) {
		sessionFactory.getCurrentSession().update(member);
	}

	@Override
	@Transactional
	public void deleteUser(int psaID) {
		Members member = (Members) sessionFactory.getCurrentSession().get(
				Members.class, psaID);
		sessionFactory.getCurrentSession().delete(member);
	}

	@Override
	public Calendar getAllQuatarData(String year) {
		StringBuilder calendarYear = new StringBuilder(year).deleteCharAt(4);
		Calendar calendar = (Calendar) sessionFactory.getCurrentSession().get(
				Calendar.class, Integer.parseInt(calendarYear.toString()));
		return calendar;
	}

	@Override
	@Transactional
	public void saveCalendar(Calendar calendar) {
		sessionFactory.getCurrentSession().update(calendar);
	}

	@Override
	public ForecastUserDetails getMemberForecastData(String year, int psaId) {
		ForecastUserDetails forecastUserDetails = new ForecastUserDetails();
		StringBuilder calendarYear = new StringBuilder(year).deleteCharAt(4);
		Calendar calendar = (Calendar) sessionFactory.getCurrentSession().get(
				Calendar.class, Integer.parseInt(calendarYear.toString()));
		// TODO: needs to update psa id.
		String getMembersQuery = "FROM UpdateForecast where psaId = " + psaId
				+ " and year = " + calendarYear;
		Query query = sessionFactory.getCurrentSession().createQuery(
				getMembersQuery);
		List<UpdateForecast> results = query.list();
		if (results.size() > 0) {
			UpdateForecast updateForecast = results.get(0);
			//
			forecastUserDetails.setUpdateForecast(updateForecast);
		}
		forecastUserDetails.setCalendar(calendar);
		return forecastUserDetails;
	}

	@Override
	@Transactional()
	public void updateForecastCalendarforUser(UpdateForecast updateForecast) {

		sessionFactory.getCurrentSession().saveOrUpdate(updateForecast);
	}

	@Override
	public boolean validateMemberLoginDetails(String psaID, String pwd) {
		String getMembersQuery = "FROM Members where psaId = " + psaID
				+ " and password = " + "'" + pwd + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(
				getMembersQuery);
		List<Members> member = query.list();
		if (member.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Transactional()
	public void addProject(Projects projects) {
		sessionFactory.getCurrentSession().save(projects);
	}

	@Override
	public List<Projects> getProjectsList() {
		String getProjectsQuery = "FROM Projects";
		Query query = sessionFactory.getCurrentSession().createQuery(getProjectsQuery);
		List<Projects> results = query.list();
		return results;	}

	@Override
	@Transactional()
	public void updateProject(Projects project) {
		sessionFactory.getCurrentSession().update(project);
	}

	@Override
	@Transactional()
	public void deleteProject(int projectId) {
		Projects projects = (Projects) sessionFactory.getCurrentSession().get(
				Projects.class, projectId);
		sessionFactory.getCurrentSession().delete(projects);		
	}

}