package org.fasttrackit.socialnetworkapi.transfer.postActivity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CreatePostActivityRequest {

    @NotNull
    @Min(0)
    private String title;

    @NotNull
    @Min(0)
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CreatePostActivityRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
