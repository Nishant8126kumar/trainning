/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package repository;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Employees extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employees\",\"namespace\":\"repository\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"designation\",\"type\":\"string\"},{\"name\":\"uuid\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence address;
  @Deprecated public java.lang.CharSequence designation;
  @Deprecated public java.lang.CharSequence uuid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Employees() {}

  /**
   * All-args constructor.
   */
  public Employees(java.lang.CharSequence name, java.lang.CharSequence address, java.lang.CharSequence designation, java.lang.CharSequence uuid) {
    this.name = name;
    this.address = address;
    this.designation = designation;
    this.uuid = uuid;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return address;
    case 2: return designation;
    case 3: return uuid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: address = (java.lang.CharSequence)value$; break;
    case 2: designation = (java.lang.CharSequence)value$; break;
    case 3: uuid = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'designation' field.
   */
  public java.lang.CharSequence getDesignation() {
    return designation;
  }

  /**
   * Sets the value of the 'designation' field.
   * @param value the value to set.
   */
  public void setDesignation(java.lang.CharSequence value) {
    this.designation = value;
  }

  /**
   * Gets the value of the 'uuid' field.
   */
  public java.lang.CharSequence getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.CharSequence value) {
    this.uuid = value;
  }

  /** Creates a new Employees RecordBuilder */
  public static repository.Employees.Builder newBuilder() {
    return new repository.Employees.Builder();
  }
  
  /** Creates a new Employees RecordBuilder by copying an existing Builder */
  public static repository.Employees.Builder newBuilder(repository.Employees.Builder other) {
    return new repository.Employees.Builder(other);
  }
  
  /** Creates a new Employees RecordBuilder by copying an existing Employees instance */
  public static repository.Employees.Builder newBuilder(repository.Employees other) {
    return new repository.Employees.Builder(other);
  }
  
  /**
   * RecordBuilder for Employees instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employees>
    implements org.apache.avro.data.RecordBuilder<Employees> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence address;
    private java.lang.CharSequence designation;
    private java.lang.CharSequence uuid;

    /** Creates a new Builder */
    private Builder() {
      super(repository.Employees.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(repository.Employees.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.address)) {
        this.address = data().deepCopy(fields()[1].schema(), other.address);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.designation)) {
        this.designation = data().deepCopy(fields()[2].schema(), other.designation);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uuid)) {
        this.uuid = data().deepCopy(fields()[3].schema(), other.uuid);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Employees instance */
    private Builder(repository.Employees other) {
            super(repository.Employees.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.address)) {
        this.address = data().deepCopy(fields()[1].schema(), other.address);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.designation)) {
        this.designation = data().deepCopy(fields()[2].schema(), other.designation);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uuid)) {
        this.uuid = data().deepCopy(fields()[3].schema(), other.uuid);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public repository.Employees.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public repository.Employees.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'address' field */
    public java.lang.CharSequence getAddress() {
      return address;
    }
    
    /** Sets the value of the 'address' field */
    public repository.Employees.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.address = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'address' field has been set */
    public boolean hasAddress() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'address' field */
    public repository.Employees.Builder clearAddress() {
      address = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'designation' field */
    public java.lang.CharSequence getDesignation() {
      return designation;
    }
    
    /** Sets the value of the 'designation' field */
    public repository.Employees.Builder setDesignation(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.designation = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'designation' field has been set */
    public boolean hasDesignation() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'designation' field */
    public repository.Employees.Builder clearDesignation() {
      designation = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'uuid' field */
    public java.lang.CharSequence getUuid() {
      return uuid;
    }
    
    /** Sets the value of the 'uuid' field */
    public repository.Employees.Builder setUuid(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.uuid = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'uuid' field has been set */
    public boolean hasUuid() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'uuid' field */
    public repository.Employees.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Employees build() {
      try {
        Employees record = new Employees();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.address = fieldSetFlags()[1] ? this.address : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.designation = fieldSetFlags()[2] ? this.designation : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.uuid = fieldSetFlags()[3] ? this.uuid : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}