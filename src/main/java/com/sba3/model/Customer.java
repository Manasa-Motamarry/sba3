package com.sba3.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class Customer {
	

			@Id
			private long cid;
			
			public long getCid() {
				return cid;
			}

			public void setCid(long cid) {
				this.cid = cid;
			}

			public String getCname() {
				return cname;
			}

			public void setCname(String cname) {
				this.cname = cname;
			}

			private String cname;
			
			private String doj;
			
			private String city;
			
			private int contactno;
			
			

			

			public String getDoj() {
				return doj;
			}

			public void setDoj(String doj) {
				this.doj = doj;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public int getContactno() {
				return contactno;
			}

			public void setContactno(int contactno) {
				this.contactno = contactno;
			}

				

}
