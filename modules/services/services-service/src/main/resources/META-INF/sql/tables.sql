create table PlanoProposta (
	id_ LONG not null primary key,
	descricao VARCHAR(75) null
);

create table Proposta (
	id_ LONG not null primary key,
	nome_completo VARCHAR(75) null,
	idade INTEGER,
	sexo VARCHAR(75) null
);