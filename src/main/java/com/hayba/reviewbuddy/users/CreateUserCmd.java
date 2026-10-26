package com.hayba.reviewbuddy.users;

record CreateUserCmd(String name, String email, String password, Role role) {}
