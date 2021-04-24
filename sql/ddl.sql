-- auto-generated definition
create table speed_model
(
    id        serial                     not null
        constraint speed_pk
            primary key,
    frame     integer,
    count     integer,
    sum       numeric,
    min       numeric,
    max       numeric,
    avr       numeric,
    camera_id text default 'cam_1'::text not null
);

alter table speed_model
    owner to postgres;

create unique index speed_id_uindex
    on speed_model (id);

-- auto-generated definition
create table open_cv
(
    id                     serial not null
        constraint "2_5463197833576320038_pk"
            primary key,
    frame                  integer,
    count                  integer,
    sum                    numeric,
    min                    numeric,
    max                    numeric,
    avr                    numeric,
    angle_mag_quantile_050 numeric(19, 2),
    angle_max              numeric(19, 2),
    angle_mean             numeric(19, 2),
    angle_quantile_010     numeric(19, 2),
    angle_quantile_025     numeric(19, 2),
    angle_quantile_070     numeric(19, 2),
    magnitude_max          numeric(19, 2),
    magnitude_mean         numeric(19, 2),
    magnitude_quantile_010 numeric(19, 2),
    magnitude_quantile_025 numeric(19, 2),
    magnitude_quantile_050 numeric(19, 2),
    magnitude_quantile_070 numeric(19, 2)
);

alter table open_cv
    owner to postgres;

create unique index "2_5463197833576320038_id_uindex"
    on open_cv (id);

--------------------------- yolo 4 ----------------------------
-- auto-generated definition
create table yolo_v4
(
    id        serial                     not null
        constraint "2_5465449633390005969_pk"
            primary key,
    frame     integer,
    count     integer,
    sum       numeric,
    min       numeric,
    max       numeric,
    n1        numeric,
    n2        numeric,
    n3        numeric,
    n4        numeric,
    n5        numeric,
    b1        numeric,
    b2        numeric,
    b3        numeric,
    b4        numeric,
    b5        numeric,
    avr       numeric,
    camera_id text default 'cam_1'::text not null
);

alter table yolo_v4
    owner to postgres;

create unique index "2_5465449633390005969_id_uindex"
    on yolo_v4 (id);

