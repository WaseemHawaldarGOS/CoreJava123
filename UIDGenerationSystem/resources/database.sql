CREATE SEQUENCE uid_seq START WITH 1000 INCREMENT BY 1;

CREATE TABLE enroll (
    ENROLL_ID    NUMBER(10),
    CONTACT_NO    NUMBER(10),
    NAME   VARCHAR2(15),
    LOOK   VARCHAR2(10),
    CONSTRAINT pk PRIMARY KEY ( ENROLL_ID )
);