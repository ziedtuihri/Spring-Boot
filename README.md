# Spring-Boot

<h3>  Spring Boot Dependencies </h3>
<br>
<a href="https://start.spring.io/" target="_blank">start.spring.io</a>
<br>
<ul>
  <li> Spring Web </li>
  <li>Spring Data JPA</li>
    <li>MySQL Driver</li>
  <li>Lombok</li>
</ul>

<h3> packages </h3>

<ul>
  <li> controller </li>
  <li> entite </li>
  <li> repository </li>
  <li> serviceImpl </li>
   <li> serviceInterface </li> 
</ul>

````

public class Bloc {
    
    @Id // Specifies that `idBloc` is the primary key of this entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicates that the primary key will be generated automatically by the database (auto-increment).
    @Setter(AccessLevel.NONE) // Prevents the generation of a setter for the `idBloc` field, as it is managed by the database.
    long idBloc; // Primary key of the Bloc entity.
    
    String nomBloc; // Field representing the name of the bloc.
    
    long capaciteBloc; // Field representing the capacity of the bloc (e.g., number of people it can hold).

    // Many Blocs belong to one Foyer, establishing a many-to-one relationship.
    @ManyToOne // JPA annotation to indicate a many-to-one relationship between Bloc and Foyer.
    @JsonIgnore // Prevents the serialization of the `foyer` field when converting the entity to JSON (to avoid infinite recursion in bidirectional relationships).
    Foyer foyer; // Reference to the `Foyer` entity that this Bloc belongs to.

    // One Bloc can have many Chambres (Rooms), this will likely require a OneToMany mapping in the Foyer class or another related class.


to add swagger add the code below on the file pom.xml
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.1.0</version>
        </dependency>
}
````

