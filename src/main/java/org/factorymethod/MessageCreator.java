package org.factorymethod;

import org.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 * 1. Object creation logic is delegated to subclasses(of MessageCreator)
 * 2. we will have a mirror of concrete classes as creators which will take the responsibility of object creation
 * 3. We would want to do this when we have "product" inheritance hierarchy and possible additions of subclasses in the future,
 * 4. when there is an addition of new subclass you would not need to alter the existing code
 */
public abstract class MessageCreator {

	public Message getMessage(){
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    protected abstract Message createMessage();
}
