USE [MedindoFebre]
GO
/****** Object:  Table [dbo].[Disciplina]    Script Date: 08/12/2014 19:18:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Disciplina](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nome] [varchar](50) NULL,
 CONSTRAINT [PK_Disciplina] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Disciplina] ON
INSERT [dbo].[Disciplina] ([id], [nome]) VALUES (1, N'Matematica')
SET IDENTITY_INSERT [dbo].[Disciplina] OFF
/****** Object:  Table [dbo].[Materia]    Script Date: 08/12/2014 19:18:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Materia](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nome] [varchar](50) NULL,
	[idDisciplina] [int] NULL,
	[serie] [int] NULL,
 CONSTRAINT [PK_Materia] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Materia] ON
INSERT [dbo].[Materia] ([id], [nome], [idDisciplina], [serie]) VALUES (1, N'Adição', 1, 1)
SET IDENTITY_INSERT [dbo].[Materia] OFF
/****** Object:  Table [dbo].[Teste]    Script Date: 08/12/2014 19:18:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Teste](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[idDisciplina] [int] NULL,
	[dataGeracao] [date] NULL,
	[numeroQuestoes] [int] NULL,
 CONSTRAINT [PK_Teste] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Questao]    Script Date: 08/12/2014 19:18:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Questao](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[bimestre] [int] NULL,
	[idMateria] [int] NULL,
	[pergunta] [varchar](200) NULL,
 CONSTRAINT [PK_Questao] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Questao] ON
INSERT [dbo].[Questao] ([id], [bimestre], [idMateria], [pergunta]) VALUES (1, 1, 1, N'Quanto é 2 + 48 = ?')
SET IDENTITY_INSERT [dbo].[Questao] OFF
/****** Object:  Table [dbo].[Resposta]    Script Date: 08/12/2014 19:18:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Resposta](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[idQuestao] [int] NOT NULL,
	[Texto] [varchar](80) NULL,
	[Correta] [bit] NULL,
 CONSTRAINT [PK_Resposta] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Resposta] ON
INSERT [dbo].[Resposta] ([id], [idQuestao], [Texto], [Correta]) VALUES (1, 1, N'50', 1)
SET IDENTITY_INSERT [dbo].[Resposta] OFF
/****** Object:  ForeignKey [FK_Materia_Disciplina]    Script Date: 08/12/2014 19:18:38 ******/
ALTER TABLE [dbo].[Materia]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Disciplina] FOREIGN KEY([idDisciplina])
REFERENCES [dbo].[Disciplina] ([id])
GO
ALTER TABLE [dbo].[Materia] CHECK CONSTRAINT [FK_Materia_Disciplina]
GO
/****** Object:  ForeignKey [FK_Questao_Materia]    Script Date: 08/12/2014 19:18:38 ******/
ALTER TABLE [dbo].[Questao]  WITH CHECK ADD  CONSTRAINT [FK_Questao_Materia] FOREIGN KEY([idMateria])
REFERENCES [dbo].[Materia] ([id])
GO
ALTER TABLE [dbo].[Questao] CHECK CONSTRAINT [FK_Questao_Materia]
GO
/****** Object:  ForeignKey [FK_Resposta_Questao]    Script Date: 08/12/2014 19:18:38 ******/
ALTER TABLE [dbo].[Resposta]  WITH CHECK ADD  CONSTRAINT [FK_Resposta_Questao] FOREIGN KEY([idQuestao])
REFERENCES [dbo].[Questao] ([id])
GO
ALTER TABLE [dbo].[Resposta] CHECK CONSTRAINT [FK_Resposta_Questao]
GO
/****** Object:  ForeignKey [FK_Teste_Disciplina]    Script Date: 08/12/2014 19:18:38 ******/
ALTER TABLE [dbo].[Teste]  WITH CHECK ADD  CONSTRAINT [FK_Teste_Disciplina] FOREIGN KEY([idDisciplina])
REFERENCES [dbo].[Disciplina] ([id])
GO
ALTER TABLE [dbo].[Teste] CHECK CONSTRAINT [FK_Teste_Disciplina]
GO
