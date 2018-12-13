package com.illriver.spring_demo04_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype的bean
 * @author Pactera
 *
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
