package patterns.behavioral.iterator;

public class JavaTeveloper implements Kollection {
    private String name;
    private String[] skills;

    public JavaTeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Jterator getJterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Jterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length) return true;
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
