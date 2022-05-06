CREATE TRIGGER [dbo.TR_Marcacao]
ON AgendaMedico 
FOR UPDATE 
AS 
  IF (SELECT count(*) FROM deleted)=1
     IF (SELECT Situacao FROM deleted)=1
        BEGIN
		     INSERT INTO AgendaControle SELECT *,CONVERT(DATE,GETDATE()),CONVERT(TIME(0),GETDATE()) FROM deleted
		     INSERT INTO AgendaControle SELECT *,CONVERT(DATE,GETDATE()),CONVERT(TIME(0),GETDATE()) FROM inserted
		END
      GO S