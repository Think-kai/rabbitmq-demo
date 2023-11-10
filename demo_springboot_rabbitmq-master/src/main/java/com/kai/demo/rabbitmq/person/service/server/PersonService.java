package com.kai.demo.rabbitmq.person.service.server;

import com.kai.demo.rabbitmq.person.dto.PersonDO;

import java.util.List;

/**
 * <p>Project: rabbitmq </p>
 * <p>Description: </p>
 * <p>Copyright (c) 2023 Karrytech (Shanghai/Beijing) Co., Ltd.</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:zhangkai@karrytech.com">Zhang Kai</a>
 */
public interface PersonService {

    boolean addPerson(PersonDO personDO) throws Exception;

    boolean removePerson(String id) throws Exception;

    boolean modifyPerson(PersonDO person) throws Exception;

    PersonDO getPerson(String id) throws Exception;

    List<PersonDO> queryPersonList(PersonDO person) throws Exception;
}
