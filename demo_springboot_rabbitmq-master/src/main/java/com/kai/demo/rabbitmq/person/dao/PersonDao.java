package com.kai.demo.rabbitmq.person.dao;

import com.kai.demo.rabbitmq.person.dto.PersonDO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PersonDao {

    int addPerson(PersonDO personDO) throws Exception;

    int removePerson(String id) throws Exception;

    int modifyPerson(PersonDO person) throws Exception;

    PersonDO getPerson(String id) throws Exception;

    List<PersonDO> queryPersonList(PersonDO person) throws Exception;


}
