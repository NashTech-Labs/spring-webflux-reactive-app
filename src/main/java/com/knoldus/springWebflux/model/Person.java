package com.knoldus.springWebflux.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    /**
     *  The session that will be used to generate unique id.
     **/
    private Integer id;
    /**
     * This a local variable: {@link #firstName}
     */
    private String firstName;
    /**
     * This a local variable: {@link #lastName}
     */
    private String lastName;
    /**
     * This a local variable: {@link #age}
     */
    private int age;

}
