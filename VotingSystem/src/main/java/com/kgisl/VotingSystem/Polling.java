package com.kgisl.VotingSystem;


public class Polling {
        protected String voter_id;
        protected String party_name;
        protected String ward;
        protected int count;
        public Polling(String voter_id, String party_name, String ward) {
            this.voter_id = voter_id;
            this.party_name = party_name;
            this.ward = ward;
        }
        public Polling(String voter_id, String party_name, String ward, int count) {
            this.voter_id = voter_id;
            this.party_name = party_name;
            this.ward = ward;
            this.count=count;
        }
        public Polling(String party_name, int count) {
            this.party_name = party_name;
            this.count = count;
        }
        public Polling(String party_name) {
            this.party_name = party_name;
          
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public String getVoter_id() {
            return voter_id;
        }
        public void setVoter_id(String voter_id) {
            this.voter_id = voter_id;
        }
        public String getParty_name() {
            return party_name;
        }
        public void setParty_name(String party_name) {
            this.party_name = party_name;
        }
        public String getWard() {
            return ward;
        }
        public void setWard(String ward) {
            this.ward = ward;
        }
        @Override        public String toString() {
            return "Polling [voter_id=" + voter_id + ", party_name=" + party_name + ", ward=" + ward + "]";
        }
    }