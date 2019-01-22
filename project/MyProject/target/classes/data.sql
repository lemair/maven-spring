INSERT INTO STUDENTI ( id, nume ) VALUES
	( 1, 'Dan'  ),
	( 2, 'George'  ),
	( 3, 'Andrei'  );
	
INSERT INTO PROFESORI ( id, nume ) VALUES
	( 1, 'PROFESOR 1' ),
	( 2, 'PROFESOR 2' ),
	( 3, 'PROFESOR 5' );

INSERT INTO NOTE ( id, nota, id_student, id_profesor ) VALUES
	( 1, 9, 1, 1 ),
	( 2, 8, 1, 2 ),
	( 5, 5, 3, 2 );