SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE FUNCTION [dbo].[F_DiaSem] (@Num INT)
      RETURNS Varchar(3)
AS 
      BEGIN
           RETURN(SUBSTRING('DOM-SEG-TER-QUA-QUI-SEX-SAB',@Num*4-3,3))
	  END;
GO