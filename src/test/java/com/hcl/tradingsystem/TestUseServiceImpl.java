package com.hcl.tradingsystem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.tradingsystem.entity.User;
import com.hcl.tradingsystem.repository.UserRepository;
import com.hcl.tradingsystem.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestUseServiceImpl {
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Mock
	UserRepository userRepository;
	
	@Test
	public void testPartIdsLists() {
		
		/*
		 * List<ActivityData> activityDataLists=new ArrayList<ActivityData>();
		 * ActivityData activityData=new ActivityData();
		 * activityData.setActivityCode(100L); activityData.setPartyId(3000L);
		 * activityData.setProductCode(200L); activityDataLists.add(activityData);
		 * 
		 * List<PartyIdsDto> partyIdDtoLists=new ArrayList<PartyIdsDto>(); PartyIdsDto
		 * partyIdsDto=new PartyIdsDto(); partyIdsDto.setPartyId(100L);
		 * partyIdDtoLists.add(partyIdsDto);
		 * 
		 * Mockito.when(activityRepository.findAll()).thenReturn(activityDataLists);
		 * 
		 * List<PartyIdsDto> response=activityServiceImpl.getPartyIdsList();
		 * 
		 * 
		 * assertEquals(activityDataLists.size(), response.size());
		 * 
		 */
		List<User> userList=new ArrayList<User>();
		User user=new User();
		user.setUserId(1l);
		user.setUserName("khan");
		userList.add(user);
		Mockito.when(userRepository.findAll()).thenReturn(userList);
		List<User> userList1=userServiceImpl.getList();
		/*
		 * List<User> userList1=new ArrayList<User>(); User user1=new User();
		 * user.setUserId(1l); user.setUserName("khan"); userList.add(user1);
		 * 
		 */ assertEquals(userList1.size(), userList.size());

		
		
	
	}
	

}
