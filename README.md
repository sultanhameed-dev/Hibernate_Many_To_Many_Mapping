# 🍃 Hibernate ORM - Many to Many Mapping

A practical Java project demonstrating how to set up and manage **Many-to-Many** entity relationships using **Hibernate ORM** and **JPA annotations**. 

This project covers real-world scenarios where multiple records in one table relate to multiple records in another (e.g., many `Students` enrolling in many `Courses`, or many `Authors` writing many `Books`).

---

## 💡 What This Project Covers

* 🔗 **Many-to-Many Association:** Using `@ManyToMany` to link entities cleanly on both sides.
* 🗄️ **Join Table Configuration:** Setting up intermediate tables using `@JoinTable`, `@JoinColumn`, and `inverseJoinColumns`.
* ⚡ **Cascading & Fetch Strategies:** Managing entity lifecycle and loading behaviors (`CascadeType`, `FetchType`).
* 🔄 **Bidirectional Relationship:** Mapping entities so you can easily query both sides of the relationship.
* 🛡️ **Data Consistency:** Managing collection references (`Set` / `List`) properly in Java domain models.

---

## 🛠️ Tech Stack & Dependencies

* **Language:** Java 17+
* **ORM Framework:** Hibernate Core
* **Database:** MySQL
* **Build Tool:** Maven

---

## ⚙️ Configuration Setup

Before running the project, update your `hibernate.cfg.xml` with your local database details:

```xml
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME</property>
<property name="connection.username">YOUR_USERNAME</property>
<property name="connection.password">YOUR_PASSWORD</property>
