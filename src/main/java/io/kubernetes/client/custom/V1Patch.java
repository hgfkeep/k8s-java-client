package io.kubernetes.client.custom;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(V1Patch.V1PatchAdapter.class)
public class V1Patch {

  private String value;

  public static final String PATCH_FORMAT_JSON_PATCH = "application/json-patch+json";
  public static final String PATCH_FORMAT_JSON_MERGE_PATCH = "application/merge-patch+json";
  public static final String PATCH_FORMAT_STRATEGIC_MERGE_PATCH = "application/strategic-merge-patch+json";
  public static final String PATCH_FORMAT_APPLY_YAML = "application/apply-patch+yaml";

  public V1Patch(final String value) {
    this.value = value;
  }


  public String getValue() {
    return value;
  }

  public class V1PatchAdapter extends TypeAdapter<V1Patch> {
    @Override
    public void write(JsonWriter jsonWriter, V1Patch patch) throws IOException {
      jsonWriter.jsonValue(patch.getValue());
    }

    @Override
    public V1Patch read(JsonReader jsonReader) throws IOException {
      throw new UnsupportedOperationException("deserializing patch data is not supported");
    }
  }
}
