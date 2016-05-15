DROP TABLE IF EXISTS task;
CREATE TABLE `test`.`task` (
  `taskId` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `task` VARCHAR(256) NOT NULL DEFAULT '',
  `process` BOOLEAN NOT NULL DEFAULT 0,
  PRIMARY KEY(`taskId`)
);

INSERT INTO task(task, process) VALUES('to buy some food',false);
INSERT INTO task(task, process) VALUES('to read some new',false);
INSERT INTO task(task, process) VALUES('to compilate this program',true);
INSERT INTO task(task, process) VALUES('to become a java programmer',true);
INSERT INTO task(task, process) VALUES('to write my diploma',true);
INSERT INTO task(task, process) VALUES('go abroad',true);
INSERT INTO task(task, process) VALUES('go travel around the world',true);
INSERT INTO task(task, process) VALUES('sleep almost 10 hours',false);
INSERT INTO task(task, process) VALUES('surf 4chan board',false);
