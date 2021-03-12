#!bin/bash

source /home/oracle/.bashrc; sqlplus /nolog

sqlplus / as sysdba << EOF
      alter session set "_ORACLE_SCRIPT"=true;

      create user dummy identified by devekis01;
      GRANT ALL PRIVILEGES TO dummy;
      exit;
EOF
