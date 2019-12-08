package com.learn.restfulwebservices.bHardCodedData;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String name;
	private Date dob;
}
