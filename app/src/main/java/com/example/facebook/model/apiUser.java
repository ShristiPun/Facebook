package com.example.facebook.model;

public class apiUser {



        private String _id;
        private String username;
        private String password;
        private  String email;
        private String  age;
        private String usertype;
        private String token;

        public apiUser(String _id, String username, String password, String email, String age, String usertype, String token) {
            this._id = _id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.age = age;
            this.usertype = usertype;
            this.token = token;
        }

        public String get_id() {
            return _id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public String getAge() {
            return age;
        }

        public String getUserttype() {
            return usertype;
        }

        public String getToken() {
            return token;
        }
    }


