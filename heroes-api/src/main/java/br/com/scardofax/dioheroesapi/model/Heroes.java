package br.com.scardofax.dioheroesapi.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Data
@NoArgsConstructor
@DynamoDBTable(tableName ="Heroes_Api_Table")
public class Heroes {

    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute (attributeName = "universe")
    private String universe;

    @DynamoDBAttribute (attributeName = "films")
    private int films;

}
