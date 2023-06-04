package com.study.java.회원관리;

import java.util.Iterator;

public interface UserService {
    // 회원정보를 등록하다.
    public void addUser(User user);
    // 회원정보를 수정하다. user.getEmail()에 대당하는 회원정보를 수정한다.
    public boolean updateUser(User user);
    // 회원정보를 삭제하다.
    public boolean deleteUser(String email);
    // 모든 회원정보를 반환한다.
    public Iterator<User> getUsers();
    // 이메일에 해당하는 정보가 있을 때 0보다 큰값을 반환
    public boolean exists(String email);
}
